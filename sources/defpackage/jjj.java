package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jjj {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jjj) && this.a == ((jjj) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a(i, 0) ? "Button" : a(i, 1) ? "Checkbox" : a(i, 2) ? "Switch" : a(i, 3) ? "RadioButton" : a(i, 4) ? "Tab" : a(i, 5) ? "Image" : a(i, 6) ? "DropdownList" : a(i, 7) ? "Picker" : a(i, 8) ? "Carousel" : "Unknown";
    }
}
