/*
 * Copyright © 2016 Kleber Infante and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messenger.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Element {

    // Atomic Number
    int atomicNumber;

    // Element
    String name;

    // Symbol
    String symbol;

    // Atomic Weight
    double atomicWeight;

    // Period
    int period;

    // Group
    int group;

    // Phase
    String phase;

    // Most Stable Crystal
    String mostStableCrystal;

    // Type
    String type;

    // Ionic Radius
    double ionicRadius;

    // Atomic Radius
    double atomicRadius;

    // Electronegativity
    double electronegativity;

    // First Ionization Potential
    double firstIonizationPotential;

    // Density
    double density;

    // Melting Point (K)
    double meltingPoint;

    // Boiling Point (K)
    double boilingPoint;

    // Isotopes
    int isotopes;

    // Discoverer
    String discoverer;

    // Year of Discovery
    int yearOfDiscovery;

    // Specific Heat Capacity
    double specificHeatCapacity;

    // Electron Configuration
    String electronConfiguration;

    // Display Row
    int row;

    // Display Column
    int displayColumn;

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(double atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getMostStableCrystal() {
        return mostStableCrystal;
    }

    public void setMostStableCrystal(String mostStableCrystal) {
        this.mostStableCrystal = mostStableCrystal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getIonicRadius() {
        return ionicRadius;
    }

    public void setIonicRadius(double ionicRadius) {
        this.ionicRadius = ionicRadius;
    }

    public double getAtomicRadius() {
        return atomicRadius;
    }

    public void setAtomicRadius(double atomicRadius) {
        this.atomicRadius = atomicRadius;
    }

    public double getElectronegativity() {
        return electronegativity;
    }

    public void setElectronegativity(double electronegativity) {
        this.electronegativity = electronegativity;
    }

    public double getFirstIonizationPotential() {
        return firstIonizationPotential;
    }

    public void setFirstIonizationPotential(double firstIonizationPotential) {
        this.firstIonizationPotential = firstIonizationPotential;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getMeltingPoint() {
        return meltingPoint;
    }

    public void setMeltingPoint(double meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public double getBoilingPoint() {
        return boilingPoint;
    }

    public void setBoilingPoint(double boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public int getIsotopes() {
        return isotopes;
    }

    public void setIsotopes(int isotopes) {
        this.isotopes = isotopes;
    }

    public String getDiscoverer() {
        return discoverer;
    }

    public void setDiscoverer(String discoverer) {
        this.discoverer = discoverer;
    }

    public int getYearOfDiscovery() {
        return yearOfDiscovery;
    }

    public void setYearOfDiscovery(int yearOfDiscovery) {
        this.yearOfDiscovery = yearOfDiscovery;
    }

    public double getSpecificHeatCapacity() {
        return specificHeatCapacity;
    }

    public void setSpecificHeatCapacity(double specificHeatCapacity) {
        this.specificHeatCapacity = specificHeatCapacity;
    }

    public String getElectronConfiguration() {
        return electronConfiguration;
    }

    public void setElectronConfiguration(String electronConfiguration) {
        this.electronConfiguration = electronConfiguration;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getDisplayColumn() {
        return displayColumn;
    }

    public void setDisplayColumn(int displayColumn) {
        this.displayColumn = displayColumn;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}