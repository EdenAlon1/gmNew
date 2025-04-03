package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlq implements nkj {
    private static final Pattern a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern b = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder c = new StringBuilder();
    private final ArrayList d = new ArrayList();
    private final luv e = new luv();

    public static float d(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long e(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        lti.f(group2);
        long parseLong2 = Long.parseLong(group2) * 60000;
        String group3 = matcher.group(i + 3);
        lti.f(group3);
        long parseLong3 = Long.parseLong(group3) * 1000;
        String group4 = matcher.group(i + 4);
        long j = parseLong + parseLong2 + parseLong3;
        if (group4 != null) {
            j += Long.parseLong(group4);
        }
        return j * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final lsz f(Spanned spanned, String str) {
        char c;
        int i;
        lsy lsyVar = new lsy();
        lsyVar.a = spanned;
        if (str == null) {
            return lsyVar.a();
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            lsyVar.g = 0;
            i = 0;
        } else if (c == 3 || c == 4 || c == 5) {
            lsyVar.g = 2;
            i = 2;
        } else {
            lsyVar.g = 1;
            i = 1;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            lsyVar.e = 2;
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            lsyVar.e = 0;
        } else {
            lsyVar.e = 1;
        }
        lsyVar.f = d(i);
        lsyVar.c(d(lsyVar.e), 0);
        return lsyVar.a();
    }

    @Override // defpackage.nkj
    public final /* synthetic */ njw a(byte[] bArr, int i, int i2) {
        return nkf.a(this, bArr, i2);
    }

    @Override // defpackage.nkj
    public final void b(byte[] bArr, int i, int i2, nki nkiVar, lts ltsVar) {
        long j;
        String str;
        this.e.I(bArr, i + i2);
        this.e.K(i);
        Charset A = this.e.A();
        if (A == null) {
            A = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (nkiVar.b == -9223372036854775807L || !nkiVar.c) ? null : new ArrayList();
        while (true) {
            String v = this.e.v(A);
            int i3 = 0;
            if (v == null) {
                break;
            }
            if (v.length() != 0) {
                try {
                    Integer.parseInt(v);
                    String v2 = this.e.v(A);
                    if (v2 == null) {
                        luj.f("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = a.matcher(v2);
                    if (matcher.matches()) {
                        long e = e(matcher, 1);
                        long e2 = e(matcher, 6);
                        this.c.setLength(0);
                        this.d.clear();
                        String v3 = this.e.v(A);
                        while (!TextUtils.isEmpty(v3)) {
                            if (this.c.length() > 0) {
                                this.c.append("<br>");
                            }
                            StringBuilder sb = this.c;
                            ArrayList arrayList2 = this.d;
                            String trim = v3.trim();
                            long j3 = j2;
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = b.matcher(trim);
                            int i4 = i3;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList2.add(group);
                                Matcher matcher3 = matcher2;
                                int start = matcher2.start() - i4;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i4 += length;
                                matcher2 = matcher3;
                            }
                            sb.append(sb2.toString());
                            v3 = this.e.v(A);
                            j2 = j3;
                            i3 = 0;
                        }
                        j = j2;
                        Spanned fromHtml = Html.fromHtml(this.c.toString());
                        int i5 = 0;
                        while (true) {
                            if (i5 >= this.d.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.d.get(i5);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        long j4 = nkiVar.b;
                        if (j4 == j || e >= j4) {
                            ltsVar.a(new njp(engw.r(f(fromHtml, str)), e, e2 - e));
                        } else if (arrayList != null) {
                            arrayList.add(new njp(engw.r(f(fromHtml, str)), e, e2 - e));
                        }
                    } else {
                        j = j2;
                        luj.f("SubripParser", "Skipping invalid timing: ".concat(v2));
                    }
                } catch (NumberFormatException unused) {
                    j = j2;
                    luj.f("SubripParser", "Skipping invalid index: ".concat(v));
                }
            } else {
                j = j2;
            }
            j2 = j;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ltsVar.a((njp) arrayList.get(i6));
            }
        }
    }

    @Override // defpackage.nkj
    public final /* synthetic */ void c() {
    }
}
