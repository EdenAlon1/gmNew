package defpackage;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public abstract class oru extends otr {
    public oru(otb otbVar) {
        super(otbVar);
    }

    public final void a(Object obj) {
        oyf d = d();
        try {
            b(d, obj);
            d.a.executeInsert();
        } finally {
            f(d);
        }
    }

    protected abstract void b(oyf oyfVar, Object obj);
}
