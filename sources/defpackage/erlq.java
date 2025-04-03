package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erlq extends enfi implements Serializable {
    final enkg a;
    transient Collection b;
    transient Map c;

    public erlq(enkg enkgVar) {
        this.a = enkgVar;
    }

    @Override // defpackage.enfi
    protected final enkg b() {
        return this.a;
    }

    @Override // defpackage.enfi, defpackage.enfl, defpackage.ennd
    public final /* bridge */ /* synthetic */ Collection c(Object obj) {
        return c(obj);
    }

    @Override // defpackage.enfi, defpackage.enfl
    protected final /* synthetic */ ennd e() {
        return this.a;
    }

    @Override // defpackage.enfi, defpackage.enkg
    /* renamed from: g */
    public final List c(Object obj) {
        return new erln(this.a.c(obj));
    }

    @Override // defpackage.enfl, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final boolean t(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return this.a.t(obj, obj2);
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final Collection u() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        erlm erlmVar = new erlm(this.a.u());
        this.b = erlmVar;
        return erlmVar;
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final Map w() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        erlp erlpVar = new erlp(this, this.a.w());
        this.c = erlpVar;
        return erlpVar;
    }
}
