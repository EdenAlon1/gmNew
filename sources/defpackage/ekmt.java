package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekmt extends qqs {
    public ekmt(qpt qptVar, rgt rgtVar, rhc rhcVar, Context context) {
        super(qptVar, rgtVar, rhcVar, context);
    }

    @Override // defpackage.qqs
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final ekms e(Drawable drawable) {
        return (ekms) super.e(drawable);
    }

    @Override // defpackage.qqs
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ekms i(String str) {
        return (ekms) super.i(str);
    }

    @Override // defpackage.qqs
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final synchronized void w(rig rigVar) {
        super.w(rigVar);
    }

    @Override // defpackage.qqs
    public final /* bridge */ /* synthetic */ qqo a(Class cls) {
        return new ekms(this.a, this, cls, this.b);
    }

    @Override // defpackage.qqs
    public final /* bridge */ /* synthetic */ qqo f(Uri uri) {
        return (ekms) super.f(uri);
    }

    @Override // defpackage.qqs
    public final /* bridge */ /* synthetic */ qqo g(Integer num) {
        return (ekms) super.g(num);
    }

    @Override // defpackage.qqs
    public final /* bridge */ /* synthetic */ qqo h(Object obj) {
        return (ekms) super.h(obj);
    }

    @Override // defpackage.qqs
    protected final void s(rig rigVar) {
        if (rigVar instanceof ekmr) {
            super.s(rigVar);
        } else {
            super.s(new ekmr().q(rigVar));
        }
    }

    @Override // defpackage.qqs
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final ekms b() {
        return (ekms) super.b();
    }

    @Override // defpackage.qqs
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final ekms c() {
        return (ekms) super.c();
    }

    @Override // defpackage.qqs
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final ekms d() {
        return (ekms) super.d();
    }
}
