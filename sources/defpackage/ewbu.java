package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewbu {
    public static float a(fivm fivmVar) {
        int i = fivmVar.b;
        int b = fivl.b(i);
        int b2 = fivl.b(i);
        if (b2 == 0) {
            throw null;
        }
        emxf.f(b == 2, "Expected feature to be float_list but was %s", fivl.a(b2));
        fivr fivrVar = fivmVar.b == 2 ? (fivr) fivmVar.c : fivr.a;
        emxf.d(fivrVar.b.size() == 1, "Expected %s to be scalar, but float_list.value count was: %d", fivrVar.b.size());
        return fivrVar.b.d(0);
    }

    public static int b(fivm fivmVar) {
        int i = fivmVar.b;
        int b = fivl.b(i);
        int b2 = fivl.b(i);
        if (b2 == 0) {
            throw null;
        }
        emxf.f(b == 3, "Expected feature to be int64_list but was %s", fivl.a(b2));
        fivt fivtVar = fivmVar.b == 3 ? (fivt) fivmVar.c : fivt.a;
        emxf.d(fivtVar.b.size() == 1, "Expected %s to be scalar, but int64_list.value count was: %d", fivtVar.b.size());
        return (int) fivtVar.b.a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static eyee c(fivm fivmVar) {
        int i = fivmVar.b;
        int b = fivl.b(i);
        int b2 = fivl.b(i);
        if (b2 == 0) {
            throw null;
        }
        emxf.f(b == 1, "Expected feature to be bytes_list but was %s", fivl.a(b2));
        fivh fivhVar = fivmVar.b == 1 ? (fivh) fivmVar.c : fivh.a;
        emxf.d(fivhVar.b.size() == 1, "Expected %s to be scalar, but bytes_list.value count was: %d", fivhVar.b.size());
        return (eyee) fivhVar.b.get(0);
    }
}
