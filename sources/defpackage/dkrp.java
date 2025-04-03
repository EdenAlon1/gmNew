package defpackage;

import android.util.Xml;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrp {
    public static final diyy a = dizd.a(165911131);
    public final Map b = new HashMap();
    public final ctvb c;
    public final dkmv d;
    public String e;
    private final djqt f;

    public dkrp(dkmv dkmvVar, ctvb ctvbVar, djqt djqtVar) {
        this.d = dkmvVar;
        this.c = ctvbVar;
        this.f = djqtVar;
    }

    public final Optional a(long j) {
        Optional ofNullable;
        synchronized (this.b) {
            ofNullable = Optional.ofNullable((dkrn) this.b.get(Long.valueOf(j)));
        }
        return ofNullable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r19.b.putAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        defpackage.dkty.i(r0, "Error while closing file: %s", r0.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkrp.b():void");
    }

    public final void c(long j) {
        Long valueOf = Long.valueOf(j);
        dkty.c("Removing group session information for session: %d", valueOf);
        synchronized (this.b) {
            if (this.b.remove(valueOf) == null) {
                return;
            }
            try {
                d();
            } catch (IOException unused) {
                dkty.g("Error while storing group data", new Object[0]);
            }
        }
    }

    public final void d() {
        if (this.e == null) {
            dkty.q("Filename was not generated. Cannot save groups.", new Object[0]);
            return;
        }
        synchronized (this.b) {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = this.f.c(this.e);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(outputStream, "utf-8");
                    newSerializer.startDocument("utf-8", false);
                    newSerializer.startTag("urn:groupsinfo.jibemobile.com", "groups");
                    for (dkrn dkrnVar : this.b.values()) {
                        if (dkrnVar.b.isPresent()) {
                            newSerializer.startTag("urn:groupsinfo.jibemobile.com", "group");
                            newSerializer.attribute("", "key", String.valueOf(dkrnVar.a));
                            newSerializer.attribute("", "contributionId", dkrnVar.d);
                            if (dkrnVar.e.isPresent()) {
                                newSerializer.attribute("", "conferenceUri", (String) dkrnVar.e.get());
                            }
                            if (dkrnVar.f.isPresent()) {
                                newSerializer.attribute("", "subject", (String) dkrnVar.f.get());
                            }
                            if (dkrnVar.g.isPresent() && ((Long) dkrnVar.g.get()).longValue() > 0) {
                                newSerializer.attribute("", "removed", dkrnVar.g.get().toString());
                            }
                            if (dkrnVar.b.isPresent()) {
                                ((dilk) dkrnVar.b.get()).d(newSerializer, "conference-info");
                            }
                            newSerializer.endTag("urn:groupsinfo.jibemobile.com", "group");
                        }
                    }
                    newSerializer.endTag("urn:groupsinfo.jibemobile.com", "groups");
                    newSerializer.endDocument();
                    newSerializer.flush();
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            dkty.i(e, "Error while closing stream: %s", e.getMessage());
                        }
                    }
                } catch (FileNotFoundException e2) {
                    throw new IOException("File could not be opened", e2);
                }
            } finally {
            }
        }
        dkty.c("Groups saved", new Object[0]);
    }
}
