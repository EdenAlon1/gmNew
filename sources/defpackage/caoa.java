package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caoa {
    public static final ffbz a;
    public static final caoa b;
    public static final caoa c;
    public static final caoa d;
    public static final caoa e;
    public static final caoa f;
    public static final caoa g;
    public static final caoa h;
    public static final caoa i;
    public static final caoa j;
    public static final caoa k;
    private static final /* synthetic */ caoa[] m;
    public final int l;

    static {
        caoa caoaVar = new caoa("SELF_REMOVED_FROM_ENCRYPTED_GROUP", 0, 230);
        b = caoaVar;
        caoa caoaVar2 = new caoa("ENCRYPTED_GROUP_PARTICIPANT_LEFT", 1, 227);
        c = caoaVar2;
        caoa caoaVar3 = new caoa("ENCRYPTED_GROUP_SELF_LEFT", 2, 228);
        d = caoaVar3;
        caoa caoaVar4 = new caoa("ENCRYPTED_GROUP_PARTICIPANT_JOINED", 3, 225);
        e = caoaVar4;
        caoa caoaVar5 = new caoa("PARTICIPANT_REMOVED_FROM_ENCRYPTED_GROUP", 4, 231);
        f = caoaVar5;
        caoa caoaVar6 = new caoa("SELF_REMOVED_FROM_GROUP", 5, 220);
        g = caoaVar6;
        caoa caoaVar7 = new caoa("PARTICIPANT_LEFT", 6, BasePaymentResult.ERROR_REQUEST_TIMEOUT);
        h = caoaVar7;
        caoa caoaVar8 = new caoa("SELF_LEFT", 7, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
        i = caoaVar8;
        caoa caoaVar9 = new caoa("PARTICIPANT_JOINED", 8, BasePaymentResult.ERROR_REQUEST_FAILED);
        j = caoaVar9;
        caoa caoaVar10 = new caoa("PARTICIPANT_REMOVED_FROM_GROUP", 9, 221);
        k = caoaVar10;
        caoa[] caoaVarArr = {caoaVar, caoaVar2, caoaVar3, caoaVar4, caoaVar5, caoaVar6, caoaVar7, caoaVar8, caoaVar9, caoaVar10};
        m = caoaVarArr;
        ffhw.a(caoaVarArr);
        a = ffca.a(new ffix() { // from class: canz
            @Override // defpackage.ffix
            public final Object invoke() {
                caoa[] values = caoa.values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(values.length), 16));
                for (caoa caoaVar11 : values) {
                    linkedHashMap.put(Integer.valueOf(caoaVar11.l), caoaVar11);
                }
                return linkedHashMap;
            }
        });
    }

    private caoa(String str, int i2, int i3) {
        this.l = i3;
    }

    public static caoa[] values() {
        return (caoa[]) m.clone();
    }
}
