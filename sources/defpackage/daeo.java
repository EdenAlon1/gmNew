package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugPrefsItemView;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daeo extends BaseAdapter implements daeq {
    private final LayoutInflater a;
    private final SharedPreferences b;
    private final List c;

    public daeo(LayoutInflater layoutInflater) {
        this.a = layoutInflater;
        SharedPreferences sharedPreferences = layoutInflater.getContext().getSharedPreferences("bugle", 0);
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        this.c = ffdx.ag(sharedPreferences.getAll().keySet());
    }

    @Override // defpackage.daeq
    public final void a(String str, Object obj) {
        str.getClass();
        obj.getClass();
        SharedPreferences.Editor edit = this.b.edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Number) obj).intValue());
        } else {
            if (!(obj instanceof Long)) {
                Objects.toString(obj);
                throw new IllegalArgumentException("Unexpected debug value ".concat(obj.toString()));
            }
            edit.putLong(str, ((Number) obj).longValue());
        }
        edit.apply();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        DebugPrefsItemView debugPrefsItemView;
        if (view instanceof DebugPrefsItemView) {
            debugPrefsItemView = (DebugPrefsItemView) view;
        } else {
            View inflate = this.a.inflate(R.layout.debug_prefs_item_view, viewGroup, false);
            inflate.getClass();
            debugPrefsItemView = (DebugPrefsItemView) inflate;
        }
        String str = (String) this.c.get(i);
        SharedPreferences sharedPreferences = this.b;
        daer H = debugPrefsItemView.H();
        Object obj = sharedPreferences.getAll().get(str);
        str.getClass();
        H.e = this;
        H.c = str;
        H.d = obj;
        H.a.setText(str);
        H.b.setText(String.valueOf(obj));
        return debugPrefsItemView;
    }
}
