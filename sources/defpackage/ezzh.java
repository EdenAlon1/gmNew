package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezzh extends eyfq implements eyht {
    public ezzh() {
        super(ezzi.a);
    }

    public final void a(int i) {
        copyOnWrite();
        ezzi ezziVar = (ezzi) this.instance;
        ezzi ezziVar2 = ezzi.a;
        eygi eygiVar = ezziVar.d;
        if (!eygiVar.c()) {
            ezziVar.d = eyfy.mutableCopy(eygiVar);
        }
        ezziVar.d.h(i - 2);
    }
}
