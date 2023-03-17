package com.msaggik.fifthlessonanimalhandbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Animal> animals; // поле коллекции контейнера для хранения данных (объектов класса Animal)

    // конструктор адаптера
    public AnimalAdapter(Context context, List<Animal> animals) {
        this.inflater = LayoutInflater.from(context);
        this.animals = animals;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Animal
    @Override
    public AnimalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Animal по определенной позиции
    @Override
    public void onBindViewHolder(AnimalAdapter.ViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.animalView.setImageResource(animal.getAnimalResource());
        holder.nameView.setText(animal.getName());
        holder.animalDescriptionView.setText(animal.getAnimalDescription());
        holder.populationSizeView.setText(animal.getPopulationSize());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return animals.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView animalView;
        final TextView nameView, animalDescriptionView, populationSizeView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            animalView = view.findViewById(R.id.animalResource);
            nameView = view.findViewById(R.id.name);
            animalDescriptionView = view.findViewById(R.id.animalDescription);
            populationSizeView = view.findViewById(R.id.populationSize);
        }
    }
}
