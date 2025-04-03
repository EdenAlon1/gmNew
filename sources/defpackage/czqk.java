package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czqk extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ SuggestionData a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ View c;
    final /* synthetic */ czqm d;

    public czqk(czqm czqmVar, SuggestionData suggestionData, AtomicReference atomicReference, View view) {
        this.a = suggestionData;
        this.b = atomicReference;
        this.c = view;
        this.d = czqmVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ctjh ctjhVar = (ctjh) this.d.f.b();
        eoqz eoqzVar = eoqz.P2P_SUGGESTION_LONG_PRESS;
        fbqp fbqpVar = fbqp.CONVERSATION_VIEW;
        boolean z = this.d.h.b;
        float floatValue = ((Float) this.b.get()).floatValue();
        SuggestionData suggestionData = this.a;
        View view = this.c;
        axnw.h(ctjhVar.f(suggestionData, eoqzVar, fbqpVar, z, floatValue, czqm.h(view), czqm.i(view)));
        super.onLongPress(motionEvent);
    }
}
