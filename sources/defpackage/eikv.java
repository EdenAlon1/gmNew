package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eikv {
    public final Class a;
    public final ContentType b;
    public final ffix c;
    private final ffix d;

    public eikv(Class cls, ContentType contentType, ffix ffixVar, ffix ffixVar2) {
        this.a = cls;
        this.b = contentType;
        this.c = ffixVar;
        this.d = ffixVar2;
    }

    public final void a(eyhs eyhsVar, eiks eiksVar) {
        eikt eiktVar = (eikt) this.d.invoke();
        Object cast = this.a.cast(eyhsVar);
        cast.getClass();
        eiktVar.a((eyhs) cast, eiksVar);
    }
}
