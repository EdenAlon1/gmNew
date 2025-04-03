package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gu extends ea {
    ListAdapter a;
    View ag;
    boolean ah;
    private final Handler ai = new Handler();
    private final Runnable aj = new gs(this);
    private final AdapterView.OnItemClickListener ak = new gt();
    ListView b;
    View c;
    TextView d;
    View e;

    private final void b() {
        if (this.b == null) {
            View view = this.Q;
            if (view == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            if (view instanceof ListView) {
                this.b = (ListView) view;
            } else {
                TextView textView = (TextView) view.findViewById(16711681);
                this.d = textView;
                if (textView == null) {
                    this.c = view.findViewById(R.id.empty);
                } else {
                    textView.setVisibility(8);
                }
                this.e = view.findViewById(16711682);
                this.ag = view.findViewById(16711683);
                View findViewById = view.findViewById(R.id.list);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById != null) {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                ListView listView = (ListView) findViewById;
                this.b = listView;
                View view2 = this.c;
                if (view2 != null) {
                    listView.setEmptyView(view2);
                }
            }
            this.ah = true;
            this.b.setOnItemClickListener(this.ak);
            ListAdapter listAdapter = this.a;
            if (listAdapter != null) {
                this.a = null;
                gm(listAdapter);
            } else if (this.e != null) {
                e(false, false);
            }
            this.ai.post(this.aj);
        }
    }

    private final void e(boolean z, boolean z2) {
        b();
        View view = this.e;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.ah == z) {
            return;
        }
        this.ah = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(z(), R.anim.fade_out));
                this.ag.startAnimation(AnimationUtils.loadAnimation(z(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.ag.clearAnimation();
            }
            this.e.setVisibility(8);
            this.ag.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(z(), R.anim.fade_in));
            this.ag.startAnimation(AnimationUtils.loadAnimation(z(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.ag.clearAnimation();
        }
        this.e.setVisibility(0);
        this.ag.setVisibility(8);
    }

    @Override // defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context A = A();
        FrameLayout frameLayout = new FrameLayout(A);
        LinearLayout linearLayout = new LinearLayout(A);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(A, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(A);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(A);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(A);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        b();
    }

    public final void gm(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.a;
        this.a = listAdapter;
        ListView listView = this.b;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.ah || listAdapter2 != null) {
                return;
            }
            e(true, N().getWindowToken() != null);
        }
    }

    @Override // defpackage.ea
    public final void i() {
        this.ai.removeCallbacks(this.aj);
        this.b = null;
        this.ah = false;
        this.ag = null;
        this.e = null;
        this.c = null;
        this.d = null;
        super.i();
    }
}
