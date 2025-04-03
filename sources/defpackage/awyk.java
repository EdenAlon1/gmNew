package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyk extends eyfq implements eyht {
    public awyk() {
        super(awyl.a);
    }

    public final void a(awui awuiVar) {
        copyOnWrite();
        awyl awylVar = (awyl) this.instance;
        awyl awylVar2 = awyl.a;
        awuiVar.getClass();
        eygr eygrVar = awylVar.d;
        if (!eygrVar.c()) {
            awylVar.d = eyfy.mutableCopy(eygrVar);
        }
        awylVar.d.add(awuiVar);
    }
}
