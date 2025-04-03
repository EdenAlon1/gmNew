package androidx.car.app.model;

import defpackage.cfs;
import defpackage.ciz;
import defpackage.cjg;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class SectionedItemTemplate implements cjg {
    private final List<Action> mActions;
    private final Header mHeader;
    private final boolean mIsAlphabeticalIndexingAllowed;
    private final boolean mIsLoading;
    private final List<Section<?>> mSections;

    private SectionedItemTemplate() {
        this.mSections = Collections.EMPTY_LIST;
        this.mActions = Collections.EMPTY_LIST;
        this.mHeader = null;
        this.mIsLoading = false;
        this.mIsAlphabeticalIndexingAllowed = false;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionedItemTemplate)) {
            return false;
        }
        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
        return Objects.equals(this.mSections, sectionedItemTemplate.mSections) && Objects.equals(this.mActions, sectionedItemTemplate.mActions) && Objects.equals(this.mHeader, sectionedItemTemplate.mHeader) && this.mIsLoading == sectionedItemTemplate.mIsLoading && this.mIsAlphabeticalIndexingAllowed == sectionedItemTemplate.mIsAlphabeticalIndexingAllowed;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public List<Section<?>> getSections() {
        return this.mSections;
    }

    public int hashCode() {
        return Objects.hash(this.mSections, this.mActions, this.mHeader, Boolean.valueOf(this.mIsLoading), Boolean.valueOf(this.mIsAlphabeticalIndexingAllowed));
    }

    public boolean isAlphabeticalIndexingAllowed() {
        return this.mIsAlphabeticalIndexingAllowed;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "SectionedItemTemplate";
    }

    private SectionedItemTemplate(ciz cizVar) {
        List list = cizVar.a;
        this.mSections = DesugarCollections.unmodifiableList(null);
        List list2 = cizVar.b;
        this.mActions = DesugarCollections.unmodifiableList(null);
        Header header = cizVar.c;
        this.mHeader = null;
        boolean z = cizVar.d;
        this.mIsLoading = false;
        boolean z2 = cizVar.e;
        this.mIsAlphabeticalIndexingAllowed = false;
    }
}
