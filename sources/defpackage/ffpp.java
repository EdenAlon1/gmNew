package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffpp extends ffkk implements ffjm {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffpp(List list) {
        super(2);
        this.a = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Object obj3;
        ffcf ffcfVar;
        Object obj4;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        charSequence.getClass();
        List list = this.a;
        if (list.size() == 1) {
            String str = (String) ffdx.S(list);
            int Q = ffpc.Q(charSequence, str, intValue, false, 4);
            if (Q >= 0) {
                ffcfVar = new ffcf(Integer.valueOf(Q), str);
            }
            ffcfVar = null;
        } else {
            ffmj ffmjVar = new ffmj(ffmk.f(intValue, 0), charSequence.length());
            if (charSequence instanceof String) {
                int i = ffmjVar.a;
                int i2 = ffmjVar.b;
                int i3 = ffmjVar.c;
                if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                    int i4 = i;
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            String str2 = (String) obj4;
                            if (ffpc.k(str2, 0, (String) charSequence, i4, str2.length(), false)) {
                                break;
                            }
                        }
                        String str3 = (String) obj4;
                        if (str3 == null) {
                            if (i4 == i2) {
                                break;
                            }
                            i4 += i3;
                        } else {
                            ffcfVar = new ffcf(Integer.valueOf(i4), str3);
                            break;
                        }
                    }
                }
                ffcfVar = null;
            } else {
                int i5 = ffmjVar.a;
                int i6 = ffmjVar.b;
                int i7 = ffmjVar.c;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    int i8 = i5;
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            String str4 = (String) obj3;
                            if (ffpc.K(str4, 0, charSequence, i8, str4.length(), false)) {
                                break;
                            }
                        }
                        String str5 = (String) obj3;
                        if (str5 == null) {
                            if (i8 == i6) {
                                break;
                            }
                            i8 += i7;
                        } else {
                            ffcfVar = new ffcf(Integer.valueOf(i8), str5);
                            break;
                        }
                    }
                }
                ffcfVar = null;
            }
        }
        if (ffcfVar == null) {
            return null;
        }
        return new ffcf(ffcfVar.a, Integer.valueOf(((String) ffcfVar.b).length()));
    }
}
