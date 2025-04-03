package org.tensorflow.lite.support.label;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class Category {
    public final String a;
    public final float b;
    private final int c;
    private final String d;

    private Category(String str, String str2, float f, int i) {
        this.a = str;
        this.d = str2;
        this.b = f;
        this.c = i;
    }

    public static Category create(String str, String str2, float f) {
        return new Category(str, str2, f, -1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Category) {
            Category category = (Category) obj;
            if (category.a.equals(this.a) && category.d.equals(this.d) && Math.abs(category.b - this.b) < 1.0E-6f && category.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.d, Float.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "<Category \"" + this.a + "\" (displayName=" + this.d + " score=" + this.b + " index=" + this.c + ")>";
    }

    public Category(String str, float f) {
        this(str, "", f, -1);
    }

    public static Category create(String str, String str2, float f, int i) {
        return new Category(str, str2, f, i);
    }
}
