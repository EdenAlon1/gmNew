package defpackage;

import android.widget.SearchView;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dadm implements SearchView.OnQueryTextListener {
    final /* synthetic */ DebugGServiceKeysFragment a;

    public dadm(DebugGServiceKeysFragment debugGServiceKeysFragment) {
        this.a = debugGServiceKeysFragment;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        boolean I;
        this.a.ag.setVisibility(str.length() > 0 ? 8 : 0);
        dadu daduVar = this.a.aj;
        str.getClass();
        List list = daduVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            I = ffpc.I((String) obj, str, false);
            if (I) {
                arrayList.add(obj);
            }
        }
        dadt dadtVar = this.a.d;
        dadtVar.a = engw.n(arrayList);
        dadtVar.notifyDataSetChanged();
        return true;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }
}
