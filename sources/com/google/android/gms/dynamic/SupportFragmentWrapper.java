package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IFragmentWrapper;
import defpackage.dfwv;
import defpackage.ea;
import defpackage.lil;
import defpackage.lim;
import defpackage.lin;
import defpackage.lip;
import defpackage.liq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {
    private final ea a;

    private SupportFragmentWrapper(ea eaVar) {
        this.a = eaVar;
    }

    public static SupportFragmentWrapper wrap(ea eaVar) {
        if (eaVar != null) {
            return new SupportFragmentWrapper(eaVar);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IObjectWrapper getActivity() {
        return ObjectWrapper.wrap(this.a.G());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public Bundle getArguments() {
        return this.a.m;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public int getId() {
        return this.a.F;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IFragmentWrapper getParentFragment() {
        return wrap(this.a.E);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IObjectWrapper getResources() {
        return ObjectWrapper.wrap(this.a.B());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean getRetainInstance() {
        int i = lin.a;
        ea eaVar = this.a;
        lip lipVar = new lip(eaVar);
        lin.d(lipVar);
        lim b = lin.b(eaVar);
        if (b.b.contains(lil.DETECT_RETAIN_INSTANCE_USAGE) && lin.e(b, eaVar.getClass(), lipVar.getClass())) {
            lin.c(b, lipVar);
        }
        return eaVar.K;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public String getTag() {
        return this.a.H;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IFragmentWrapper getTargetFragment() {
        return wrap(this.a.E());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public int getTargetRequestCode() {
        int i = lin.a;
        ea eaVar = this.a;
        liq liqVar = new liq(eaVar);
        lin.d(liqVar);
        lim b = lin.b(eaVar);
        if (b.b.contains(lil.DETECT_TARGET_FRAGMENT_USAGE) && lin.e(b, eaVar.getClass(), liqVar.getClass())) {
            lin.c(b, liqVar);
        }
        return eaVar.p;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean getUserVisibleHint() {
        return this.a.S;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IObjectWrapper getView() {
        return ObjectWrapper.wrap(this.a.Q);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isAdded() {
        return this.a.aF();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isDetached() {
        return this.a.J;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isHidden() {
        return this.a.aG();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isInLayout() {
        return this.a.w;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isRemoving() {
        return this.a.s;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isResumed() {
        return this.a.aI();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isVisible() {
        return this.a.aK();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void registerForContextMenu(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        dfwv.n(view);
        view.setOnCreateContextMenuListener(this.a);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setHasOptionsMenu(boolean z) {
        this.a.av(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setMenuVisibility(boolean z) {
        this.a.ax(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setRetainInstance(boolean z) {
        this.a.aA(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setUserVisibleHint(boolean z) {
        this.a.aC(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void startActivity(Intent intent) {
        this.a.aD(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void startActivityForResult(Intent intent, int i) {
        this.a.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void unregisterForContextMenu(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        dfwv.n(view);
        view.setOnCreateContextMenuListener(null);
    }
}
