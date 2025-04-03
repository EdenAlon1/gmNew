package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxd {
    public final erhj a;

    private dvxd(erhj erhjVar) {
        emxf.b(((erhk) erhjVar.instance).d != 0, "VeIdentifier must be non-zero");
        this.a = erhjVar;
    }

    public static dvxd a(int i) {
        erhj erhjVar = (erhj) erhk.a.createBuilder();
        erhjVar.copyOnWrite();
        erhk erhkVar = (erhk) erhjVar.instance;
        erhkVar.b |= 8;
        erhkVar.d = i;
        return new dvxd(erhjVar);
    }
}
