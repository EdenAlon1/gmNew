package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eftm extends eftr {
    public static final entd a = entd.c("TachyonCountryCodeSel");
    public boolean ag;
    public dczp ah;
    public ViewFlipper b;
    public RecyclerView c;
    public efth d;
    public LinearLayoutManager e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_country_code, viewGroup, false);
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.b = (ViewFlipper) view.findViewById(R.id.country_code_view_flipper);
        this.c = (RecyclerView) view.findViewById(R.id.country_code_list);
        z();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.e = linearLayoutManager;
        this.c.ap(linearLayoutManager);
        this.b.setDisplayedChild(0);
        erqt.r(((dczq) this.ah.c.b()).a.submit(new eftq()), new eftl(this), erpp.a);
        efth efthVar = new efth(new efti(this), this.m.getString("com.google.android.libraries.tachyon.countrycode.arg.COUNTRY_CODE_SELECTED"));
        this.d = efthVar;
        this.c.am(efthVar);
        this.ag = bundle != null;
    }
}
