package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwzt implements oyy, dwzh {
    public final Executor a;
    public final ea b;
    public final dwzi c;
    public RecyclerView d;
    public SwipeRefreshLayout e;
    public TextView f;
    public dwyq g;
    public EditText h;

    public dwzt(ea eaVar, Executor executor, dwzi dwziVar) {
        this.c = dwziVar;
        this.b = eaVar;
        this.a = executor;
    }

    @Override // defpackage.oyy
    public final void a() {
        this.c.c();
    }

    @Override // defpackage.dwzh
    public final void b(final String str) {
        this.b.fe().runOnUiThread(new Runnable() { // from class: dwzs
            @Override // java.lang.Runnable
            public final void run() {
                dwzt dwztVar = dwzt.this;
                dwztVar.d.setVisibility(8);
                dwztVar.f.setVisibility(0);
                dwztVar.f.setText(str);
            }
        });
    }
}
