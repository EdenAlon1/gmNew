package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avty extends avtp {
    @Override // defpackage.avtp
    public final void c(ContentType contentType, awun awunVar) {
        awunVar.a(contentType.a());
    }

    @Override // defpackage.avtp
    public final void d(awup awupVar, eifc eifcVar) {
        eifcVar.h(enhk.j(DesugarCollections.unmodifiableMap(awupVar.e)));
    }
}
