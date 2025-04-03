package androidx.car.app.model;

import defpackage.cfs;
import defpackage.cjg;
import defpackage.clb;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private String mId;
    private boolean mIsRefresh;
    private cjg mTemplate;
    private List<TemplateInfo> mTemplateInfoForScreenStack;

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }

    public static TemplateWrapper copyOf(TemplateWrapper templateWrapper) {
        TemplateWrapper wrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        wrap.setRefresh(templateWrapper.isRefresh());
        wrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        List<TemplateInfo> templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            wrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return wrap;
    }

    private static String createRandomId() {
        return UUID.randomUUID().toString();
    }

    public static TemplateWrapper wrap(cjg cjgVar) {
        return wrap(cjgVar, createRandomId());
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public String getId() {
        String str = this.mId;
        str.getClass();
        return str;
    }

    public cjg getTemplate() {
        cjg cjgVar = this.mTemplate;
        cjgVar.getClass();
        return cjgVar;
    }

    public List<TemplateInfo> getTemplateInfosForScreenStack() {
        return clb.a(this.mTemplateInfoForScreenStack);
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(cjg cjgVar) {
        this.mTemplate = cjgVar;
    }

    public void setTemplateInfosForScreenStack(List<TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public String toString() {
        return "[template: " + this.mTemplate + ", ID: " + this.mId + "]";
    }

    private TemplateWrapper(cjg cjgVar, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = cjgVar;
        this.mId = str;
    }

    public static TemplateWrapper wrap(cjg cjgVar, String str) {
        cjgVar.getClass();
        str.getClass();
        return new TemplateWrapper(cjgVar, str);
    }
}
