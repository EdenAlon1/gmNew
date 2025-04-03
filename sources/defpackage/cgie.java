package defpackage;

import android.net.Uri;
import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.UriWithType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgie {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/kids/intents/TrustedContactsIntents");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final aqkp f;
    public final aqly g;

    public cgie(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, aqkp aqkpVar, aqly aqlyVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        aqkpVar.getClass();
        aqlyVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = aqkpVar;
        this.g = aqlyVar;
    }

    public static final Uri b(String str) {
        Uri build = new Uri.Builder().scheme("sms").opaquePart(str).build();
        build.getClass();
        return build;
    }

    public static final IndividualContactRequest c(String str) {
        IndividualContactRequest individualContactRequest = new IndividualContactRequest();
        UriWithType uriWithType = new UriWithType();
        uriWithType.a = b(str);
        individualContactRequest.b = new UriWithType[]{uriWithType};
        return individualContactRequest;
    }

    public final Object a(String str, ffgu ffguVar) {
        Object b = this.b.b();
        b.getClass();
        return ffra.a(ekxi.a((ffhd) b), new cgid(null, this, str), ffguVar);
    }
}
