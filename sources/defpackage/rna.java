package defpackage;

import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rna extends rmj {
    protected rna() {
    }

    @Override // defpackage.rmj, defpackage.rml
    public final void b(rmp rmpVar) {
        if (!(rmpVar instanceof rmz)) {
            throw new SAXException(a.b(rmpVar, "Text content elements cannot contain ", " elements."));
        }
        this.i.add(rmpVar);
    }
}
