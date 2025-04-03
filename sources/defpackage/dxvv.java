package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvv {
    public static dwtt a(String str, Context context, dwxf dwxfVar) {
        dwts dwtsVar;
        List i = emye.d("|").i(str);
        int ordinal = dxkk.a(context, dwxfVar).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (i.size() != 4) {
                    throw new dxvu("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
                }
                dwtsVar = (dwts) dwtt.a.createBuilder();
                String str2 = (String) i.get(0);
                dwtsVar.copyOnWrite();
                dwtt dwttVar = (dwtt) dwtsVar.instance;
                str2.getClass();
                dwttVar.b |= 1;
                dwttVar.c = str2;
                long parseInt = Integer.parseInt((String) i.get(1));
                dwtsVar.copyOnWrite();
                dwtt dwttVar2 = (dwtt) dwtsVar.instance;
                dwttVar2.b |= 2;
                dwttVar2.d = parseInt;
                String str3 = (String) i.get(2);
                dwtsVar.copyOnWrite();
                dwtt dwttVar3 = (dwtt) dwtsVar.instance;
                str3.getClass();
                dwttVar3.b |= 4;
                dwttVar3.e = str3;
                int a = dwsm.a(Integer.parseInt((String) i.get(3)));
                dwtsVar.copyOnWrite();
                dwtt dwttVar4 = (dwtt) dwtsVar.instance;
                int i2 = a - 1;
                if (a == 0) {
                    throw null;
                }
                dwttVar4.f = i2;
                dwttVar4.b |= 8;
            } else {
                if (i.size() != 2) {
                    throw new dxvu("Bad-format serializedFileKey = s".concat(String.valueOf(str)));
                }
                dwtsVar = (dwts) dwtt.a.createBuilder();
                String str4 = (String) i.get(0);
                dwtsVar.copyOnWrite();
                dwtt dwttVar5 = (dwtt) dwtsVar.instance;
                str4.getClass();
                dwttVar5.b |= 4;
                dwttVar5.e = str4;
                int a2 = dwsm.a(Integer.parseInt((String) i.get(1)));
                dwtsVar.copyOnWrite();
                dwtt dwttVar6 = (dwtt) dwtsVar.instance;
                int i3 = a2 - 1;
                if (a2 == 0) {
                    throw null;
                }
                dwttVar6.f = i3;
                dwttVar6.b |= 8;
            }
        } else {
            if (i.size() != 5) {
                throw new dxvu("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
            }
            dwts dwtsVar2 = (dwts) dwtt.a.createBuilder();
            String str5 = (String) i.get(0);
            dwtsVar2.copyOnWrite();
            dwtt dwttVar7 = (dwtt) dwtsVar2.instance;
            str5.getClass();
            dwttVar7.b |= 1;
            dwttVar7.c = str5;
            long parseInt2 = Integer.parseInt((String) i.get(1));
            dwtsVar2.copyOnWrite();
            dwtt dwttVar8 = (dwtt) dwtsVar2.instance;
            dwttVar8.b |= 2;
            dwttVar8.d = parseInt2;
            String str6 = (String) i.get(2);
            dwtsVar2.copyOnWrite();
            dwtt dwttVar9 = (dwtt) dwtsVar2.instance;
            str6.getClass();
            dwttVar9.b |= 4;
            dwttVar9.e = str6;
            int a3 = dwsm.a(Integer.parseInt((String) i.get(3)));
            dwtsVar2.copyOnWrite();
            dwtt dwttVar10 = (dwtt) dwtsVar2.instance;
            int i4 = a3 - 1;
            if (a3 == 0) {
                throw null;
            }
            dwttVar10.f = i4;
            dwttVar10.b |= 8;
            if (i.get(4) != null && !((String) i.get(4)).isEmpty()) {
                try {
                    fasl faslVar = (fasl) dxvw.b((String) i.get(4), fasl.a.getParserForType());
                    dwtsVar2.copyOnWrite();
                    dwtt dwttVar11 = (dwtt) dwtsVar2.instance;
                    faslVar.getClass();
                    dwttVar11.g = faslVar;
                    dwttVar11.b |= 16;
                } catch (eygu e) {
                    throw new dxvu("Failed to deserialize key:".concat(String.valueOf(str)), e);
                }
            }
            dwtsVar = dwtsVar2;
        }
        return (dwtt) dwtsVar.build();
    }

    public static String b(dwtt dwttVar, Context context, dwxf dwxfVar) {
        int ordinal = dxkk.a(context, dwxfVar).ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? c(dwttVar) : d(dwttVar) : e(dwttVar) : c(dwttVar);
    }

    public static String c(dwtt dwttVar) {
        StringBuilder sb = new StringBuilder(dwttVar.c);
        sb.append("|");
        sb.append(dwttVar.d);
        sb.append("|");
        sb.append(dwttVar.e);
        sb.append("|");
        int a = dwsm.a(dwttVar.f);
        if (a == 0) {
            a = 1;
        }
        sb.append(a - 1);
        return sb.toString();
    }

    public static String d(dwtt dwttVar) {
        StringBuilder sb = new StringBuilder(dwttVar.e);
        sb.append("|");
        int a = dwsm.a(dwttVar.f);
        if (a == 0) {
            a = 1;
        }
        sb.append(a - 1);
        return sb.toString();
    }

    public static String e(dwtt dwttVar) {
        String str;
        StringBuilder sb = new StringBuilder(dwttVar.c);
        sb.append("|");
        sb.append(dwttVar.d);
        sb.append("|");
        sb.append(dwttVar.e);
        sb.append("|");
        int a = dwsm.a(dwttVar.f);
        if (a == 0) {
            a = 1;
        }
        sb.append(a - 1);
        sb.append("|");
        if ((dwttVar.b & 16) != 0) {
            fasl faslVar = dwttVar.g;
            if (faslVar == null) {
                faslVar = fasl.a;
            }
            str = dxvw.e(faslVar);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
