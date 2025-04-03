package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ecte {
    protected final fgpf a;

    public ecte(fgpf fgpfVar) {
        this.a = fgpfVar;
    }

    public abstract long a(String str);

    public abstract fgpf b(Long l);

    public abstract fgpf c(Long l);

    public abstract boolean d();

    public final fgpf e() {
        fgpc builder = b(null).toBuilder();
        builder.copyOnWrite();
        fgpf fgpfVar = (fgpf) builder.instance;
        fgpfVar.b |= 2;
        fgpfVar.c = -1L;
        return builder.build();
    }
}
