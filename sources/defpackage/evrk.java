package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evrk implements evrq {
    private final evqe a;
    private final evrr b;
    private final Set c = enpw.i();

    public evrk(evqe evqeVar, evrr evrrVar) {
        this.a = evqeVar;
        this.b = evrrVar;
    }

    private final synchronized void b(String str) {
        InputStream inputStream;
        List list;
        if (this.c.contains(str)) {
            return;
        }
        try {
            try {
                inputStream = ((evrh) this.a).b.open(str, 3);
            } catch (FileNotFoundException unused) {
                evrh.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.AndroidAssetMetadataLoader", "loadMetadata", String.format("File %s not found", str));
                inputStream = null;
            } catch (IOException e) {
                throw new evri(String.format("Error while opening %s: ", str), e);
            }
            InputStream inputStream2 = inputStream;
            if (inputStream2 == null) {
                list = Collections.EMPTY_LIST;
            } else {
                try {
                    try {
                        eygr eygrVar = ((evqq) eyfy.parseFrom(evqq.a, inputStream2, eyfc.a())).b;
                        emxf.b(!eygrVar.isEmpty(), "Empty metadata");
                        try {
                            inputStream2.close();
                        } catch (IOException e2) {
                            evrj.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.MetadataParser", "parse", "Error closing input stream (ignored)", (Throwable) e2);
                        }
                        list = eygrVar;
                    } catch (IOException e3) {
                        throw new IllegalStateException("Unable to parse metadata file", e3);
                    }
                } finally {
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.b.a((evqo) it.next());
            }
            this.c.add(str);
        } catch (IllegalArgumentException | IllegalStateException e4) {
            throw new IllegalStateException("Failed to read file ".concat(str), e4);
        }
    }

    @Override // defpackage.evrq
    public final evrr a(String str) {
        if (!this.c.contains(str)) {
            b(str);
        }
        return this.b;
    }
}
