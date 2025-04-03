package defpackage;

import com.android.vcard.VCardConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crtc extends crtb {
    private static final enru j = enru.c("com/google/android/apps/messaging/shared/util/calendar/CalendarBuilderWrapper");

    public crtc() {
        super(new crtk(), new fgyv(), new fgwk(), fgzc.a.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final crtd c(InputStream inputStream) {
        fhel.a("ical4j.unfolding.relaxed", true);
        fhel.a("ical4j.parsing.relaxed", true);
        fhel.a("ical4j.compatibility.outlook", true);
        fhel.a("ical4j.compatibility.notes", true);
        try {
            fguj fgujVar = new fguj(new InputStreamReader(inputStream, crtb.a));
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.e = new ArrayList();
            fgtx fgtxVar = this.b;
            fgug fgugVar = this.c;
            StreamTokenizer streamTokenizer = new StreamTokenizer(fgujVar);
            try {
                streamTokenizer.resetSyntax();
                streamTokenizer.wordChars(32, PrivateKeyType.INVALID);
                streamTokenizer.whitespaceChars(0, 20);
                streamTokenizer.ordinaryChar(58);
                streamTokenizer.ordinaryChar(59);
                streamTokenizer.ordinaryChar(61);
                streamTokenizer.ordinaryChar(9);
                streamTokenizer.eolIsSignificant(true);
                streamTokenizer.whitespaceChars(0, 0);
                streamTokenizer.quoteChar(34);
                crtk.e(streamTokenizer, fgujVar, VCardConstants.PROPERTY_BEGIN, true);
                crtk.f(streamTokenizer, fgujVar, 58);
                crtk.e(streamTokenizer, fgujVar, "VCALENDAR", true);
                crtk.f(streamTokenizer, fgujVar, 10);
                ((crta) fgugVar).d.f = new fgum();
                ((crtk) fgtxVar).d.a(streamTokenizer, fgujVar, fgugVar);
                crtf crtfVar = ((crtk) fgtxVar).b;
                while (emuz.e(VCardConstants.PROPERTY_BEGIN, streamTokenizer.sval)) {
                    crtfVar.a.c.a(streamTokenizer, fgujVar, fgugVar);
                    crtk.c(streamTokenizer, fgujVar);
                }
                crtk.f(streamTokenizer, fgujVar, 58);
                crtk.e(streamTokenizer, fgujVar, "VCALENDAR", true);
            } catch (Exception e) {
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                if (!(e instanceof fgui)) {
                    throw new fgui(e.getMessage(), crtk.a(streamTokenizer, fgujVar), e);
                }
            }
            if (!this.e.isEmpty()) {
                super.b();
            }
            this.f.getClass();
            fgum fgumVar = this.f;
            fgumVar.getClass();
            fguv fguvVar = fgumVar.b;
            int size = fguvVar.size();
            for (int i = 0; i < size; i++) {
                E e2 = fguvVar.get(i);
                fgut fgutVar = e2 instanceof fgut ? (fgut) e2 : null;
                if (fgutVar != null && "VEVENT".equals(fgutVar.a)) {
                    fgwo a = fgutVar.a("SUMMARY");
                    String a2 = a == null ? null : a.a();
                    fgwo a3 = fgutVar.a("DESCRIPTION");
                    String a4 = a3 == null ? null : a3.a();
                    fgwo a5 = fgutVar.a("LOCATION");
                    String a6 = a5 == null ? null : a5.a();
                    fhaa fhaaVar = (fhaa) fgutVar;
                    long time = fhaaVar.c().c.getTime();
                    fhcm fhcmVar = (fhcm) fhaaVar.a("DTEND");
                    if (fhcmVar == null && fhaaVar.c() != null) {
                        fhco c = fhaaVar.c();
                        fhcm fhcmVar2 = new fhcm(fheo.d((fhaaVar.d() != null ? fhaaVar.d() : c.c instanceof fgvb ? new fhcq(new fgvd(0)) : new fhcq(new fgvd(1))).c.b(c.c), (fhbs) c.b(VCardConstants.PARAM_VALUE)));
                        if (c.g()) {
                            fhcmVar2.f(true);
                        }
                        fhcmVar = fhcmVar2;
                    }
                    long time2 = fhcmVar.c.getTime();
                    fgwo a7 = fgutVar.a("RRULE");
                    return new crsz(Long.valueOf(time), Long.valueOf(time2), a2, a4, a6, a7 != null ? a7.a() : null);
                }
            }
            return null;
        } catch (fgui e3) {
            ensk i2 = j.i();
            i2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i2).g(e3)).h("com/google/android/apps/messaging/shared/util/calendar/CalendarBuilderWrapper", "buildEvent", '7', "CalendarBuilderWrapper.java")).q("Failed to fetch event from file!");
            return null;
        }
    }
}
