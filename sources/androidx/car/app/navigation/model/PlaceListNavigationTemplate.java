package androidx.car.app.navigation.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import defpackage.cfs;
import defpackage.cid;
import defpackage.cjg;
import defpackage.ckf;
import defpackage.cki;
import j$.util.Objects;

/* compiled from: PG */
@cfs
@Deprecated
/* loaded from: classes.dex */
public final class PlaceListNavigationTemplate implements cjg {
    private final ActionStrip mActionStrip;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final ActionStrip mMapActionStrip;
    private final cid mOnContentRefreshDelegate;
    private final ckf mPanModeDelegate;

    @Deprecated
    private final CarText mTitle;

    private PlaceListNavigationTemplate() {
        this.mTitle = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeader = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeDelegate = null;
        this.mOnContentRefreshDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListNavigationTemplate)) {
            return false;
        }
        PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) obj;
        if (this.mIsLoading == placeListNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, placeListNavigationTemplate.mTitle) && Objects.equals(this.mItemList, placeListNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, placeListNavigationTemplate.mMapActionStrip)) {
            if (Objects.equals(Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(placeListNavigationTemplate.mPanModeDelegate == null))) {
                if (Objects.equals(Boolean.valueOf(this.mOnContentRefreshDelegate == null), Boolean.valueOf(placeListNavigationTemplate.mOnContentRefreshDelegate == null)) && Objects.equals(this.mHeader, placeListNavigationTemplate.mHeader)) {
                    return true;
                }
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public cid getOnContentRefreshDelegate() {
        return this.mOnContentRefreshDelegate;
    }

    public ckf getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Boolean.valueOf(this.mIsLoading), this.mItemList, this.mHeaderAction, this.mActionStrip, this.mMapActionStrip, Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(this.mOnContentRefreshDelegate == null), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "PlaceListNavigationTemplate";
    }

    PlaceListNavigationTemplate(cki ckiVar) {
        CarText carText = ckiVar.a;
        this.mTitle = null;
        boolean z = ckiVar.b;
        this.mIsLoading = false;
        ItemList itemList = ckiVar.c;
        this.mItemList = null;
        Header header = ckiVar.d;
        this.mHeader = null;
        Action action = ckiVar.e;
        this.mHeaderAction = null;
        ActionStrip actionStrip = ckiVar.f;
        this.mActionStrip = null;
        ActionStrip actionStrip2 = ckiVar.g;
        this.mMapActionStrip = null;
        ckf ckfVar = ckiVar.h;
        this.mPanModeDelegate = null;
        cid cidVar = ckiVar.i;
        this.mOnContentRefreshDelegate = null;
    }
}
