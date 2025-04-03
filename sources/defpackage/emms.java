package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class emms {
    public static emhv a(String str) {
        List i = emye.d(":").f().a().i(str);
        if (i.size() != 2) {
            return emhv.a;
        }
        emhu emhuVar = (emhu) emhv.a.createBuilder();
        emhw emhwVar = (emhw) emhx.a.createBuilder();
        String str2 = (String) i.get(0);
        emhwVar.copyOnWrite();
        emhx emhxVar = (emhx) emhwVar.instance;
        str2.getClass();
        emhxVar.b |= 1;
        emhxVar.c = str2;
        String str3 = (String) i.get(1);
        emhwVar.copyOnWrite();
        emhx emhxVar2 = (emhx) emhwVar.instance;
        str3.getClass();
        emhxVar2.b = 2 | emhxVar2.b;
        emhxVar2.d = str3;
        emhuVar.copyOnWrite();
        emhv emhvVar = (emhv) emhuVar.instance;
        emhx emhxVar3 = (emhx) emhwVar.build();
        emhxVar3.getClass();
        emhvVar.c = emhxVar3;
        emhvVar.b |= 1;
        return (emhv) emhuVar.build();
    }

    public static String b(emhv emhvVar) {
        StringBuilder sb = new StringBuilder();
        if ((emhvVar.b & 2) != 0) {
            sb.append("local_file_path: ");
            sb.append(emhvVar.d);
        }
        int i = emhvVar.b;
        if ((i & 1) != 0) {
            if ((i & 2) != 0) {
                sb.append("\n");
            }
            sb.append("mdd_file {    id: ");
            emhx emhxVar = emhvVar.c;
            if (emhxVar == null) {
                emhxVar = emhx.a;
            }
            sb.append(emhxVar.c);
            sb.append("\n    group: ");
            emhx emhxVar2 = emhvVar.c;
            if (emhxVar2 == null) {
                emhxVar2 = emhx.a;
            }
            sb.append(emhxVar2.d);
            sb.append("\n}");
        }
        return sb.toString();
    }
}
