package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dukp implements Comparable {
    final int a;
    final int b;
    final String c;

    public dukp(Matcher matcher) {
        this.a = matcher.start();
        this.b = matcher.end();
        this.c = matcher.group();
    }

    public static List a(Matcher matcher) {
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(new dukp(matcher));
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.a, ((dukp) obj).a);
    }
}
