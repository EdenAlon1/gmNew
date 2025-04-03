package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class awmq {
    static final awmq c;
    static final awmq d;
    static final awmq e;

    static {
        awjp awjpVar = new awjp();
        awjpVar.b(true);
        awjpVar.c(false);
        c = awjpVar.a();
        awjp awjpVar2 = new awjp();
        awjpVar2.b(true);
        awjpVar2.c(true);
        d = awjpVar2.a();
        awjp awjpVar3 = new awjp();
        awjpVar3.b(false);
        awjpVar3.c(false);
        e = awjpVar3.a();
    }

    public abstract boolean a();

    public abstract boolean b();

    final awmq c(awmq awmqVar) {
        awjp awjpVar = new awjp();
        boolean z = true;
        awjpVar.b(a() && ((awjq) awmqVar).a);
        if (!b() && !((awjq) awmqVar).b) {
            z = false;
        }
        awjpVar.c(z);
        return awjpVar.a();
    }
}
