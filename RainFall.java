public class RainFall {
    private double[] totalRainfall = new double[12];

    public void setRainfall(double rainfall, int index) {
        this.totalRainfall[index] = rainfall;
    }

    public int rainDataSize() {
        return totalRainfall.length;
    }

    public double getRainfall(int index) {
        return this.totalRainfall[index];
    }

    public double totalYearlyRainfall() {
        double totalRainfall = 0;
        for (double i : this.totalRainfall) {
            totalRainfall = totalRainfall + i;
        }
        return totalRainfall;
    }

    public double[] monthlyRainfall() {
        return this.totalRainfall;
    }

    public double yearlyAvgRainfall() {
        double avg = 0;
        for (double i : this.totalRainfall) {
            avg += i;
        }
        avg /= 12;
        return avg;
    }

    public double mostRain() {
        double mostRain = getRainfall(0);
        for (int i = 0; i < this.totalRainfall.length; i++) {
             if (getRainfall(i) > mostRain)
                mostRain = getRainfall(i);
        }
         return mostRain;
    }

    public int mostRainMonth() {
        double mostRain = getRainfall(0);
        int idx = 0;
        for (int i = 0; i < this.totalRainfall.length; i++) {
             if (getRainfall(i) > mostRain) {
                mostRain = getRainfall(i);
                idx = i;
             }
        }
         return idx+1;
    }

    public double leastRain() {
        double leastRain = getRainfall(0);
        for (int i = 0; i < this.totalRainfall.length; i++) {
             if (getRainfall(i) < leastRain)
                 leastRain = getRainfall(i);
        }
         return leastRain;
    }

    public int leastRainMonth() {
        double leastRain = getRainfall(0);
        int idx = 0;
        for (int i = 0; i < this.totalRainfall.length; i++) {
             if (getRainfall(i) < leastRain) {
                 leastRain = getRainfall(i);
                 idx = i;
             }
        }
         return idx+1;
    }
}
