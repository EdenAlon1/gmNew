package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dllc extends TouchDelegate {
    public static final /* synthetic */ int c = 0;
    public final Map a;
    public TouchDelegate b;

    public dllc(View view, TouchDelegate touchDelegate) {
        super(new Rect(), view);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        if (!(touchDelegate instanceof dllc)) {
            this.b = touchDelegate;
            return;
        }
        dllc dllcVar = (dllc) touchDelegate;
        this.b = dllcVar.b;
        linkedHashMap.putAll(dllcVar.a);
    }

    private static boolean a(MotionEvent motionEvent, TouchDelegate touchDelegate) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        boolean onTouchEvent = touchDelegate.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent;
    }

    @Override // android.view.TouchDelegate
    public final AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        int regionCount;
        Region regionAt;
        ArrayMap arrayMap = new ArrayMap(this.a.size());
        for (View view : this.a.keySet()) {
            touchDelegateInfo = ((TouchDelegate) this.a.get(view)).getTouchDelegateInfo();
            boolean z = true;
            emxf.l(!(r3 instanceof dllc));
            regionCount = touchDelegateInfo.getRegionCount();
            if (regionCount != 1) {
                z = false;
            }
            emxf.l(z);
            regionAt = touchDelegateInfo.getRegionAt(0);
            arrayMap.put(regionAt, view);
        }
        return new AccessibilityNodeInfo.TouchDelegateInfo(arrayMap);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        if (touchDelegate != null && a(motionEvent, touchDelegate)) {
            return true;
        }
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            TouchDelegate touchDelegate2 = (TouchDelegate) this.a.get((View) it.next());
            touchDelegate2.getClass();
            if (a(motionEvent, touchDelegate2)) {
                return true;
            }
        }
        return false;
    }
}
