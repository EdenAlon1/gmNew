package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewcr extends eyfq implements eyht {
    public ewcr() {
        super(ewcs.a);
    }

    public final void a(float f) {
        copyOnWrite();
        ewcs ewcsVar = (ewcs) this.instance;
        ewcs ewcsVar2 = ewcs.a;
        eygh eyghVar = ewcsVar.b;
        if (!eyghVar.c()) {
            ewcsVar.b = eyfy.mutableCopy(eyghVar);
        }
        ewcsVar.b.h(f);
    }
}
