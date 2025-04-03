package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsj implements cowq {
    private final cowq a;

    public cfsj(cowq cowqVar, asqi asqiVar) {
        asqiVar.getClass();
        this.a = cowqVar;
    }

    @Override // defpackage.cowq
    @ffbs
    public final elfl b(MessageCoreData messageCoreData, avkl avklVar) {
        messageCoreData.getClass();
        elfl b = this.a.b(messageCoreData, avklVar);
        b.getClass();
        return b;
    }

    @Override // defpackage.cowq
    public final elfl c(MessageCoreData messageCoreData, avkl avklVar, int i) {
        messageCoreData.getClass();
        elfl c = this.a.c(messageCoreData, avklVar, i);
        c.getClass();
        return c;
    }

    @Override // defpackage.cowq
    public final elfl d(bdhg bdhgVar, Instant instant, avkl avklVar, Optional optional, awui awuiVar, Bundle bundle) {
        instant.getClass();
        awuiVar.getClass();
        elfl d = this.a.d(bdhgVar, instant, avklVar, optional, awuiVar, bundle);
        d.getClass();
        return d;
    }

    @Override // defpackage.cowq
    public final elfl e(MessageCoreData messageCoreData, avkl avklVar) {
        messageCoreData.getClass();
        elfl e = this.a.e(messageCoreData, avklVar);
        e.getClass();
        return e;
    }

    @Override // defpackage.cowq
    public final boolean f(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        return this.a.f(messageCoreData);
    }
}
