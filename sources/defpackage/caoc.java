package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caoc {
    public static final ffbz a;
    public static final caoc b;
    public static final caoc c;
    public static final caoc d;
    public static final caoc e;
    public static final caoc f;
    private static final /* synthetic */ caoc[] h;
    public final int g;

    static {
        caoc caocVar = new caoc("RCS_GROUP_CREATED", 0, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED);
        b = caocVar;
        caoc caocVar2 = new caoc("ENCRYPTED_GROUP_CREATED", 1, 229);
        c = caocVar2;
        caoc caocVar3 = new caoc("PARTICIPANT_JOINED", 2, BasePaymentResult.ERROR_REQUEST_FAILED);
        d = caocVar3;
        caoc caocVar4 = new caoc("ENCRYPTED_GROUP_PARTICIPANT_JOINED", 3, 225);
        e = caocVar4;
        caoc caocVar5 = new caoc("ENCRYPTED_GROUP_PARTICIPANT_JOINED_INFO", 4, 226);
        f = caocVar5;
        caoc[] caocVarArr = {caocVar, caocVar2, caocVar3, caocVar4, caocVar5};
        h = caocVarArr;
        ffhw.a(caocVarArr);
        a = ffca.a(new ffix() { // from class: caob
            @Override // defpackage.ffix
            public final Object invoke() {
                caoc[] values = caoc.values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(values.length), 16));
                for (caoc caocVar6 : values) {
                    linkedHashMap.put(Integer.valueOf(caocVar6.g), caocVar6);
                }
                return linkedHashMap;
            }
        });
    }

    private caoc(String str, int i, int i2) {
        this.g = i2;
    }

    public static caoc[] values() {
        return (caoc[]) h.clone();
    }

    public final camy a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        throw null;
                    }
                }
            }
            return camy.d;
        }
        return camy.c;
    }
}
