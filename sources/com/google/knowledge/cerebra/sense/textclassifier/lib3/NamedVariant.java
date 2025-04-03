package com.google.knowledge.cerebra.sense.textclassifier.lib3;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class NamedVariant {
    public final String a;
    public final int b = 4;
    public int c;
    public long d;
    public float e;
    public double f;
    public boolean g;
    public String h;
    public String[] i;
    public float[] j;
    public int[] k;
    public NamedVariant[] l;

    public NamedVariant(String str, double d) {
        this.a = str;
        this.f = d;
    }

    public NamedVariant(String str, float f) {
        this.a = str;
        this.e = f;
    }

    public NamedVariant(String str, int i) {
        this.a = str;
        this.c = i;
    }

    public NamedVariant(String str, long j) {
        this.a = str;
        this.d = j;
    }

    public NamedVariant(String str, String str2) {
        this.a = str;
        this.h = str2;
    }

    public NamedVariant(String str, boolean z) {
        this.a = str;
        this.g = z;
    }

    public NamedVariant(String str, float[] fArr) {
        this.a = str;
        this.j = fArr;
    }

    public NamedVariant(String str, int[] iArr) {
        this.a = str;
        this.k = iArr;
    }

    public NamedVariant(String str, NamedVariant[] namedVariantArr) {
        this.a = str;
        this.l = namedVariantArr;
    }

    public NamedVariant(String str, String[] strArr) {
        this.a = str;
        this.i = strArr;
    }
}
