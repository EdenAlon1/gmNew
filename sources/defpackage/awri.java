package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class awri {
    public abstract awrj a();

    public abstract void b(int i);

    public abstract void c(awxk awxkVar);

    public final awrj d() {
        awrj a = a();
        emxf.m(true, "Invalid negative content part index");
        awnu awnuVar = (awnu) a;
        emxf.m(awnuVar.b < awnuVar.a.o.size(), "Content part index larger than content count");
        return a;
    }
}
