package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eidq {
    public int a = -1;

    public abstract eidr a();

    public abstract engr b();

    public abstract void c(eyee eyeeVar);

    public abstract void d(edzh edzhVar);

    public final eidr e() {
        eidr a = a();
        eidh eidhVar = (eidh) a;
        if (eidhVar.b.isPresent() && !Objects.equals(eidhVar.a, eyee.b)) {
            throw new IllegalArgumentException("content and messageContent can't be both present.");
        }
        if (Objects.equals(eidhVar.a, eyee.b) && eidhVar.b.isEmpty()) {
            throw new IllegalArgumentException("One of content and messageContent should be present.");
        }
        return a;
    }

    public final void f(String str, String str2) {
        b().h(str);
        b().h(str2);
    }
}
