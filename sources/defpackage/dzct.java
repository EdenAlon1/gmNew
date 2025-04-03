package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzct {
    private final dyjf a;

    public dzct(dyjf dyjfVar) {
        this.a = dyjfVar;
    }

    public static fcek b(dzpg dzpgVar) {
        dzpf dzpfVar = dzpf.UNKNOWN;
        fgtg fgtgVar = dzpgVar.b().ordinal() != 1 ? fgtg.EMAIL : fgtg.PHONE_NUMBER;
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).b = fgtgVar.a();
        String d = dzpgVar.d();
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).c = d;
        String e = dzpgVar.e();
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).d = e;
        return (fcek) fcejVar.build();
    }

    public static final ListenableFuture c(final cgji cgjiVar, String str, String str2, UUID uuid) {
        final HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("ID", str);
        }
        if (str2 != null) {
            hashMap.put("APP_NAME", str2);
        }
        if (uuid != null) {
            hashMap.put("REQUEST_ID", uuid.toString());
        }
        dyhr.a("RegReqBuilder", "DroidGuard Args: ".concat(hashMap.toString()));
        return dyjm.a(new Callable() { // from class: dzcr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dgat.a(cgji.this.a, "tachyon_registration", hashMap);
            }
        });
    }

    public static final ListenableFuture d() {
        dyhw.b();
        return erqt.n(new erog() { // from class: dzco
            @Override // defpackage.erog
            public final ListenableFuture a() {
                try {
                    Optional a = adhj.a("466216207879", "FCM");
                    return erqt.i(a.isPresent() ? (String) a.get() : "");
                } catch (Exception e) {
                    throw new dzcl(e);
                }
            }
        }, dyia.b().a);
    }

    public final fcbr a(String str, String str2, String str3, PublicKey publicKey) {
        fcbq fcbqVar = (fcbq) fcbr.a.createBuilder();
        fcbqVar.copyOnWrite();
        fcbr fcbrVar = (fcbr) fcbqVar.instance;
        str.getClass();
        fcbrVar.f = str;
        fcbqVar.copyOnWrite();
        fcbr fcbrVar2 = (fcbr) fcbqVar.instance;
        str2.getClass();
        fcbrVar2.q = str2;
        String languageTag = Locale.getDefault().toLanguageTag();
        fcbqVar.copyOnWrite();
        fcbr fcbrVar3 = (fcbr) fcbqVar.instance;
        languageTag.getClass();
        fcbrVar3.j = languageTag;
        List a = this.a.a();
        fcbqVar.copyOnWrite();
        fcbr fcbrVar4 = (fcbr) fcbqVar.instance;
        eygi eygiVar = fcbrVar4.k;
        if (!eygiVar.c()) {
            fcbrVar4.k = eyfy.mutableCopy(eygiVar);
        }
        eydl.addAll(a, fcbrVar4.k);
        fceh fcehVar = (fceh) fcei.a.createBuilder();
        fcehVar.copyOnWrite();
        fcei fceiVar = (fcei) fcehVar.instance;
        str.getClass();
        fceiVar.c = str;
        fcehVar.copyOnWrite();
        ((fcei) fcehVar.instance).b = 1;
        fcbqVar.copyOnWrite();
        fcbr fcbrVar5 = (fcbr) fcbqVar.instance;
        fcei fceiVar2 = (fcei) fcehVar.build();
        fceiVar2.getClass();
        fcbrVar5.e = fceiVar2;
        fcbrVar5.b |= 1;
        fcez fcezVar = (fcez) fcfa.a.createBuilder();
        eyee x = eyee.x(publicKey.getEncoded());
        fcezVar.copyOnWrite();
        ((fcfa) fcezVar.instance).c = x;
        fcezVar.copyOnWrite();
        ((fcfa) fcezVar.instance).b = fgtk.a(4);
        fcfa fcfaVar = (fcfa) fcezVar.build();
        fcbqVar.copyOnWrite();
        fcbr fcbrVar6 = (fcbr) fcbqVar.instance;
        fcfaVar.getClass();
        fcbrVar6.i = fcfaVar;
        fcbrVar6.b |= 4;
        if (str3 != null) {
            fcbqVar.copyOnWrite();
            fcbr fcbrVar7 = (fcbr) fcbqVar.instance;
            fcbrVar7.c = 7;
            fcbrVar7.d = str3;
        }
        return (fcbr) fcbqVar.build();
    }
}
