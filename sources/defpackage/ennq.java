package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ennq extends enns implements enkg {
    public ennq(enkg enkgVar, enmu enmuVar) {
        super(enkgVar, enmuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.enns
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List a(Object obj, Collection collection) {
        return enkr.g((List) collection, new enmh(this.b, obj));
    }

    @Override // defpackage.enns, defpackage.ennd
    /* renamed from: g */
    public final List c(Object obj) {
        return a(obj, this.a.c(obj));
    }

    @Override // defpackage.enns, defpackage.ennd
    /* renamed from: h */
    public final List d(Object obj) {
        return a(obj, this.a.d(obj));
    }
}
