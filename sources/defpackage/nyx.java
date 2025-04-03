package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyx extends ffkk implements ffix {
    final /* synthetic */ nyy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyx(nyy nyyVar) {
        super(0);
        this.a = nyyVar;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nyy nyyVar = this.a;
        if (nyyVar.g()) {
            String str = nyyVar.c;
            str.getClass();
            Uri b = oac.b(str);
            for (String str2 : b.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParameters = b.getQueryParameters(str2);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException("Query parameter " + str2 + " must only be present once in " + nyyVar.c + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                }
                queryParameters.getClass();
                String str3 = (String) ffdx.M(queryParameters);
                if (str3 == null) {
                    nyyVar.g = true;
                    str3 = str2;
                }
                ffpa ffpaVar = nyy.a;
                str3.getClass();
                nyo nyoVar = new nyo();
                int i = 0;
                for (ffos e = ffpaVar.e(str3); e != null; e = e.c()) {
                    ffor b2 = ((ffov) e).b.b(1);
                    b2.getClass();
                    nyoVar.b.add(b2.a);
                    if (e.b().a > i) {
                        String substring = str3.substring(i, e.b().a);
                        substring.getClass();
                        sb.append(ffow.a(substring));
                    }
                    sb.append("([\\s\\S]+?)?");
                    i = e.b().b + 1;
                }
                if (i < str3.length()) {
                    String substring2 = str3.substring(i);
                    substring2.getClass();
                    sb.append(ffow.a(substring2));
                }
                sb.append("$");
                nyoVar.a = nyy.j(sb.toString());
                str2.getClass();
                linkedHashMap.put(str2, nyoVar);
            }
        }
        return linkedHashMap;
    }
}
