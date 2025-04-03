package androidx.car.app.model;

import defpackage.cfs;
import defpackage.cjg;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class TemplateInfo {
    private final Class<? extends cjg> mTemplateClass;
    private final String mTemplateId;

    private TemplateInfo() {
        this.mTemplateClass = null;
        this.mTemplateId = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateInfo)) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) obj;
        return Objects.equals(this.mTemplateClass, templateInfo.mTemplateClass) && Objects.equals(this.mTemplateId, templateInfo.mTemplateId);
    }

    public Class<? extends cjg> getTemplateClass() {
        Class<? extends cjg> cls = this.mTemplateClass;
        cls.getClass();
        return cls;
    }

    public String getTemplateId() {
        String str = this.mTemplateId;
        str.getClass();
        return str;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplateClass, this.mTemplateId);
    }

    public TemplateInfo(Class<? extends cjg> cls, String str) {
        this.mTemplateClass = cls;
        this.mTemplateId = str;
    }
}
