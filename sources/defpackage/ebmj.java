package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebmj extends LinearLayout {
    public ebmj(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.choose_an_account_content, this);
        setOrientation(1);
    }

    public static void b(RecyclerView recyclerView, vk vkVar) {
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.getContext();
        recyclerView.ap(new LinearLayoutManager());
        ebov.a(recyclerView, vkVar);
    }

    public final ebds a(lld lldVar, ebkq ebkqVar, ebbb ebbbVar, ebny ebnyVar, int i) {
        Context context = getContext();
        if (lldVar == null) {
            int i2 = engw.d;
            lldVar = new llg(enou.a);
        }
        lld lldVar2 = lldVar;
        ebbg ebbgVar = (ebbg) ebbbVar;
        ebbc ebbcVar = ebbgVar.b;
        ebvw ebvwVar = ebbgVar.k;
        ebga ebgaVar = ebbgVar.e;
        return new ebds(context, ebbcVar, lldVar2, ebnyVar, ebvwVar, i);
    }
}
