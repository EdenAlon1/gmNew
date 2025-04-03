package androidx.car.app.model;

import defpackage.cfs;
import defpackage.cjd;
import defpackage.cjg;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final cjg mTemplate;

    private TabContents() {
        this.mTemplate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabContents) {
            return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
        }
        return false;
    }

    public String getContentId() {
        return CONTENT_ID;
    }

    public cjg getTemplate() {
        cjg cjgVar = this.mTemplate;
        cjgVar.getClass();
        return cjgVar;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    TabContents(cjd cjdVar) {
        cjg cjgVar = cjdVar.a;
        this.mTemplate = null;
    }
}
