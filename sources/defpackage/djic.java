package defpackage;

import android.telephony.PhoneNumberUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djic {
    public static clqv a(String str) {
        String str2 = null;
        try {
            eeit e = new eenb(str).e();
            if (e.l()) {
                eeiq eeiqVar = (eeiq) e;
                String e2 = eeiqVar.e();
                if (e2 == null || Objects.equals(eeiqVar.m(), "phone") || PhoneNumberUtils.isGlobalPhoneNumber(e2)) {
                    str2 = e2;
                }
            } else if (e instanceof eeir) {
                eeir eeirVar = (eeir) e;
                if (eeirVar.e()) {
                    str2 = "+" + eeirVar.a();
                } else {
                    str2 = eeirVar.a();
                }
            }
        } catch (eeje unused) {
        }
        if (str2 == null) {
            return b(str);
        }
        clqt clqtVar = (clqt) clqv.a.createBuilder();
        clqp clqpVar = (clqp) clqq.a.createBuilder();
        clqpVar.copyOnWrite();
        clqq clqqVar = (clqq) clqpVar.instance;
        clqqVar.b |= 1;
        clqqVar.c = str2;
        clqtVar.copyOnWrite();
        clqv clqvVar = (clqv) clqtVar.instance;
        clqq clqqVar2 = (clqq) clqpVar.build();
        clqqVar2.getClass();
        clqvVar.c = clqqVar2;
        clqvVar.b = 1;
        return (clqv) clqtVar.build();
    }

    public static clqv b(String str) {
        if (!str.startsWith("sip:")) {
            throw new IllegalArgumentException("URI format not supported");
        }
        clqt clqtVar = (clqt) clqv.a.createBuilder();
        clte clteVar = (clte) cltf.a.createBuilder();
        clteVar.copyOnWrite();
        cltf cltfVar = (cltf) clteVar.instance;
        str.getClass();
        cltfVar.b |= 1;
        cltfVar.c = str;
        clqtVar.copyOnWrite();
        clqv clqvVar = (clqv) clqtVar.instance;
        cltf cltfVar2 = (cltf) clteVar.build();
        cltfVar2.getClass();
        clqvVar.c = cltfVar2;
        clqvVar.b = 2;
        return (clqv) clqtVar.build();
    }
}
