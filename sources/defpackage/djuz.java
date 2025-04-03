package defpackage;

import android.text.TextUtils;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djuz {
    private final dgat a;
    private final djut b;

    public djuz(dgat dgatVar, djut djutVar) {
        this.a = dgatVar;
        this.b = djutVar;
    }

    public final String a(djux djuxVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("APP_NAME", "com.google.android.apps.messaging");
        djus djusVar = (djus) djuxVar;
        if (!djusVar.a.isEmpty()) {
            hashMap.put("IMSI", djux.j(djusVar.a, djusVar.f));
        }
        if (!djusVar.g.isEmpty()) {
            hashMap.put("IMEI", djux.j(djusVar.g, djusVar.f));
        }
        if (!djusVar.b.isEmpty()) {
            hashMap.put("MSISDN", djux.j(djusVar.b, djusVar.f));
        }
        if (!djusVar.c.isEmpty()) {
            hashMap.put("MSISDN_TOKEN", djux.j(djusVar.c, djusVar.f));
        }
        if (!djusVar.d.isEmpty()) {
            hashMap.put("GMSCORE_IID_TOKEN", djux.j(djusVar.d, djusVar.f));
        }
        if (!djusVar.e.isEmpty()) {
            hashMap.put("JIBE_ACS_COOKIE", djux.j(djusVar.e, djusVar.f));
        }
        dgat dgatVar = this.a;
        hashMap.put("PROVISIONING_SESSION_ID", djux.j((String) djusVar.h.map(new Function() { // from class: djuv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return emxe.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("unknown"), djusVar.f));
        String b = dgatVar.b("rcs_provisioning", hashMap, new DroidGuardResultsRequest());
        djut djutVar = this.b;
        eyqk eyqkVar = (eyqk) eyqm.a.createBuilder();
        int i = true != TextUtils.isEmpty(b) ? 3 : 4;
        eyqkVar.copyOnWrite();
        eyqm eyqmVar = (eyqm) eyqkVar.instance;
        eyqmVar.c = i - 1;
        eyqmVar.b |= 1;
        djutVar.a((eyqm) eyqkVar.build(), djusVar.h);
        return b;
    }

    public final void b(djux djuxVar, dkbm dkbmVar) {
        dkbmVar.k("Droid-Guard", a(djuxVar));
        dkbmVar.k("Droid-Guard-Salt", ((djus) djuxVar).f);
    }
}
