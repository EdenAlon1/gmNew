package com.google.android.libraries.mdi.download.debug.sting;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import defpackage.a;
import defpackage.abh;
import defpackage.dxaf;
import defpackage.kud;
import defpackage.kvd;
import defpackage.kvo;
import defpackage.nyj;
import defpackage.oaf;
import defpackage.obs;
import defpackage.obt;
import defpackage.obu;
import defpackage.obv;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MddDebugActivity extends dxaf {
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Rect rect = new Rect();
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof EditText) {
                rect.setEmpty();
                currentFocus.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    currentFocus.clearFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.dxaf, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View findViewById;
        abh.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.mdd_debug_activity);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);
        int[] iArr = {R.id.navigation_filegroups, R.id.navigation_debuginfo};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 2; i++) {
            hashSet.add(Integer.valueOf(iArr[i]));
        }
        obt obtVar = new obt(hashSet);
        if (Build.VERSION.SDK_INT >= 28) {
            findViewById = requireViewById(R.id.nav_host);
        } else {
            findViewById = findViewById(R.id.nav_host);
            if (findViewById == null) {
                throw new IllegalArgumentException("ID does not reference a View inside this Activity");
            }
        }
        findViewById.getClass();
        nyj b = oaf.b(findViewById);
        if (b == null) {
            throw new IllegalStateException(a.i(this, "Activity ", " does not have a NavController set on 2131429233"));
        }
        b.l(R.navigation.debug_navigation);
        b.j(new obs(this, obtVar));
        bottomNavigationView.getClass();
        bottomNavigationView.d = new obu(b);
        b.j(new obv(new WeakReference(bottomNavigationView), b));
        View findViewById2 = findViewById(R.id.container_activity);
        kud kudVar = new kud() { // from class: dxaj
            @Override // defpackage.kud
            public final kxh ey(View view, kxh kxhVar) {
                kpt f = kxhVar.f(519);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (marginLayoutParams == null) {
                    return kxhVar;
                }
                marginLayoutParams.topMargin = f.c;
                marginLayoutParams.bottomMargin = f.e;
                marginLayoutParams.leftMargin = f.b;
                marginLayoutParams.rightMargin = f.d;
                view.setLayoutParams(marginLayoutParams);
                return kxh.a;
            }
        };
        int[] iArr2 = kvo.a;
        kvd.k(findViewById2, kudVar);
    }
}
