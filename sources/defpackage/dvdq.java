package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dvdq {
    public abstract int a();

    public abstract evzm b();

    public final eyce c() {
        eybz eybzVar = (eybz) eyce.a.createBuilder();
        int a = a();
        eycb eycbVar = a != 1 ? a != 2 ? eycb.ORIENTATION_UNKNOWN : eycb.ORIENTATION_LANDSCAPE : eycb.ORIENTATION_PORTRAIT;
        eybzVar.copyOnWrite();
        eyce eyceVar = (eyce) eybzVar.instance;
        eyceVar.c = eycbVar.d;
        eyceVar.b |= 1;
        int ordinal = b().ordinal();
        eycd eycdVar = ordinal != 1 ? ordinal != 2 ? eycd.THEME_UNKNOWN : eycd.THEME_DARK : eycd.THEME_LIGHT;
        eybzVar.copyOnWrite();
        eyce eyceVar2 = (eyce) eybzVar.instance;
        eyceVar2.d = eycdVar.d;
        eyceVar2.b |= 2;
        return (eyce) eybzVar.build();
    }
}
