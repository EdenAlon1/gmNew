package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.text.ParseException;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crtj {
    final /* synthetic */ crtk a;

    public crtj(crtk crtkVar) {
        this.a = crtkVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, fgug fgugVar) {
        int i;
        String str = streamTokenizer.sval;
        crta crtaVar = (crta) fgugVar;
        crtaVar.d.i = crtaVar.b.a(emuz.d(str));
        while (crtk.b(streamTokenizer, reader) == 59) {
            crtk crtkVar = this.a.f.a;
            crtk.f(streamTokenizer, reader, -3);
            String str2 = streamTokenizer.sval;
            crtk.f(streamTokenizer, reader, 61);
            StringBuilder sb = new StringBuilder();
            if (crtk.b(streamTokenizer, reader) == 34) {
                sb.append(String.format("\"%s\"", streamTokenizer.sval));
            } else if (streamTokenizer.sval != null) {
                sb.append(streamTokenizer.sval);
                while (true) {
                    int b = crtk.b(streamTokenizer, reader);
                    if (b == 59 || b == 58 || b == 44) {
                        break;
                    } else {
                        crtk.d(streamTokenizer, sb);
                    }
                }
                streamTokenizer.pushBack();
            } else if (streamTokenizer.sval == null) {
                streamTokenizer.pushBack();
            }
            try {
                String sb2 = sb.toString();
                try {
                    crtb.a(((crta) fgugVar).d.i);
                    fgvi a = ((crta) fgugVar).c.a(emuz.d(str2), fhev.b(sb2));
                    fgwo fgwoVar = ((crta) fgugVar).d.i;
                    fgwoVar.getClass();
                    fgwoVar.b.c(a);
                } catch (RuntimeException e) {
                    fgwo fgwoVar2 = ((crta) fgugVar).d.i;
                    fgwoVar2.getClass();
                    if (!fgwoVar2.a.startsWith("X-")) {
                        throw e;
                    }
                }
            } catch (ClassCastException e2) {
                throw new fgui("Error parsing parameter", crtk.a(streamTokenizer, reader), e2);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        streamTokenizer.ordinaryChar(34);
        while (crtk.b(streamTokenizer, reader) != 10) {
            crtk.d(streamTokenizer, sb3);
        }
        streamTokenizer.quoteChar(34);
        try {
            if ("RRULE".equals(str)) {
                String sb4 = sb3.toString();
                Matcher matcher = crte.a.matcher(sb4.trim());
                if (matcher.matches()) {
                    StringBuilder sb5 = new StringBuilder();
                    String d = emuz.d(matcher.group(1));
                    String group = matcher.group(2);
                    String d2 = emuz.d(matcher.group(3).trim());
                    String group2 = matcher.group(4);
                    String group3 = matcher.group(5);
                    char charAt = d.charAt(0);
                    if (charAt == 'D') {
                        i = 4;
                    } else if (charAt == 'M') {
                        i = 6;
                    } else if (charAt == 'W') {
                        i = 5;
                    } else {
                        if (charAt != 'Y') {
                            throw new AssertionError();
                        }
                        i = 7;
                    }
                    sb5.append("FREQ=");
                    sb5.append(i != 4 ? i != 5 ? i != 6 ? "YEARLY" : "MONTHLY" : "WEEKLY" : "DAILY");
                    if (group != null && !group.isEmpty() && !"1".equals(group)) {
                        sb5.append(";INTERVAL=");
                        sb5.append(group);
                    }
                    if (d2 != null && !d2.isEmpty()) {
                        String[] split = crte.b.split(d2);
                        for (int i2 = 0; i2 < split.length; i2++) {
                            String str3 = split[i2];
                            char charAt2 = str3.charAt(str3.length() - 1);
                            if (charAt2 == '+') {
                                split[i2] = str3.substring(0, str3.length() - 1);
                            } else if (charAt2 == '-') {
                                split[i2] = charAt2 + str3.substring(0, str3.length() - 1);
                            }
                            if (str3.equals("LD")) {
                                split[i2] = "-1";
                            }
                        }
                        int i3 = i - 1;
                        if (i3 == 4) {
                            sb5.append(";BYDAY=");
                            crte.a(sb5, split);
                        } else if (i3 != 5) {
                            if (i3 == 6) {
                                String str4 = ";BYYEARDAY=";
                                if (d.charAt(1) != 'D') {
                                    str4 = ";BYMONTH=";
                                }
                                sb5.append(str4);
                                crte.a(sb5, split);
                            }
                        } else if (d.charAt(1) == 'P') {
                            sb5.append(";BYDAY=");
                            int i4 = 0;
                            boolean z = false;
                            for (int i5 = 0; i5 < split.length; i5++) {
                                if (Character.isLetter(split[i5].charAt(0))) {
                                    if (i5 > i4) {
                                        while (i4 < i5) {
                                            if (z) {
                                                sb5.append(",");
                                            }
                                            sb5.append(split[i4]);
                                            sb5.append(split[i5]);
                                            i4++;
                                            z = true;
                                        }
                                    } else {
                                        if (z) {
                                            sb5.append(",");
                                        }
                                        sb5.append(split[i5]);
                                        z = true;
                                    }
                                    i4 = i5 + 1;
                                }
                            }
                        } else {
                            sb5.append(";BYMONTHDAY=");
                            crte.a(sb5, split);
                        }
                    }
                    if (group2 != null) {
                        if (!"0".equals(group2)) {
                            sb5.append(";COUNT=");
                            sb5.append(group2);
                        }
                    } else if (group3 != null) {
                        String d3 = emuz.d(group3);
                        sb5.append(";UNTIL=");
                        sb5.append(d3);
                        if (!d3.endsWith("Z") && d3.contains("T")) {
                            sb5.append("Z");
                        }
                    }
                    sb4 = sb5.toString();
                }
                fgugVar.a(sb4);
            } else {
                fgugVar.a(sb3.toString());
            }
            crtb.a(crtaVar.d.i);
            crtb crtbVar = crtaVar.d;
            fgwo fgwoVar3 = crtbVar.i;
            fgwoVar3.getClass();
            crtbVar.i = fhen.a(fgwoVar3);
            crtb crtbVar2 = crtaVar.d;
            fgwo fgwoVar4 = crtbVar2.i;
            fgwoVar4.getClass();
            fgut fgutVar = crtbVar2.g;
            if (fgutVar != null) {
                fgut fgutVar2 = crtbVar2.h;
                if (fgutVar2 != null) {
                    fgutVar2.b.add(fgwoVar4);
                } else {
                    fgutVar.b.add(fgwoVar4);
                }
            } else {
                fgum fgumVar = crtbVar2.f;
                if (fgumVar != null) {
                    fgumVar.a.add(fgwoVar4);
                }
            }
            crtaVar.d.i = null;
        } catch (IllegalArgumentException | ParseException e3) {
            ensk i6 = crtk.a.i();
            i6.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i6).g(e3)).h("com/google/android/apps/messaging/shared/util/calendar/VCalendarParser$PropertyParser", "parse", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "VCalendarParser.java")).D("[%s] %s", str, e3.getMessage());
        }
    }
}
