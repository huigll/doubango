/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.39
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

class tinyWRAPJNI {
  public final static native long new_SipEvent__SWIG_0();
  public final static native long new_SipEvent__SWIG_1(int jarg1, short jarg2, String jarg3);
  public final static native void delete_SipEvent(long jarg1);
  public final static native short SipEvent_getCode(long jarg1, SipEvent jarg1_);
  public final static native String SipEvent_getPhrase(long jarg1, SipEvent jarg1_);
  public final static native long SipEvent_getBaseSession(long jarg1, SipEvent jarg1_);
  public final static native long new_SipSession(long jarg1, SipStack jarg1_);
  public final static native void delete_SipSession(long jarg1);
  public final static native boolean SipSession_addHeader(long jarg1, SipSession jarg1_, String jarg2, String jarg3);
  public final static native boolean SipSession_removeHeader(long jarg1, SipSession jarg1_, String jarg2);
  public final static native boolean SipSession_addCaps__SWIG_0(long jarg1, SipSession jarg1_, String jarg2, String jarg3);
  public final static native boolean SipSession_addCaps__SWIG_1(long jarg1, SipSession jarg1_, String jarg2);
  public final static native boolean SipSession_removeCaps(long jarg1, SipSession jarg1_, String jarg2);
  public final static native boolean SipSession_setExpires(long jarg1, SipSession jarg1_, long jarg2);
  public final static native boolean SipSession_setFromUri(long jarg1, SipSession jarg1_, String jarg2);
  public final static native boolean SipSession_setToUri(long jarg1, SipSession jarg1_, String jarg2);
  public final static native long new_RegistrationEvent();
  public final static native void delete_RegistrationEvent(long jarg1);
  public final static native int RegistrationEvent_getType(long jarg1, RegistrationEvent jarg1_);
  public final static native long RegistrationEvent_getSession(long jarg1, RegistrationEvent jarg1_);
  public final static native long new_RegistrationSession(long jarg1, SipStack jarg1_);
  public final static native void delete_RegistrationSession(long jarg1);
  public final static native boolean RegistrationSession_Register(long jarg1, RegistrationSession jarg1_, long jarg2);
  public final static native boolean RegistrationSession_UnRegister(long jarg1, RegistrationSession jarg1_);
  public final static native long new_SipCallback();
  public final static native void delete_SipCallback(long jarg1);
  public final static native int SipCallback_OnRegistrationChanged(long jarg1, SipCallback jarg1_, long jarg2, RegistrationEvent jarg2_);
  public final static native int SipCallback_OnRegistrationChangedSwigExplicitSipCallback(long jarg1, SipCallback jarg1_, long jarg2, RegistrationEvent jarg2_);
  public final static native void SipCallback_director_connect(SipCallback obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void SipCallback_change_ownership(SipCallback obj, long cptr, boolean take_or_release);
  public final static native long new_SafeObject();
  public final static native void delete_SafeObject(long jarg1);
  public final static native int SafeObject_Lock(long jarg1, SafeObject jarg1_);
  public final static native int SafeObject_UnLock(long jarg1, SafeObject jarg1_);
  public final static native long new_SipStack(long jarg1, SipCallback jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native void delete_SipStack(long jarg1);
  public final static native boolean SipStack_Start(long jarg1, SipStack jarg1_);
  public final static native boolean SipStack_setPassword(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setProxyCSCF(long jarg1, SipStack jarg1_, String jarg2, long jarg3, String jarg4, String jarg5);
  public final static native boolean SipStack_setLocalIP(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setLocalPort(long jarg1, SipStack jarg1_, long jarg2);
  public final static native boolean SipStack_addHeader(long jarg1, SipStack jarg1_, String jarg2, String jarg3);
  public final static native boolean SipStack_removeHeader(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_Stop(long jarg1, SipStack jarg1_);
  public final static native long SWIGRegistrationEventUpcast(long jarg1);
  public final static native long SWIGRegistrationSessionUpcast(long jarg1);
  public final static native long SWIGSipStackUpcast(long jarg1);

  public static int SwigDirector_SipCallback_OnRegistrationChanged(SipCallback self, long e) {
    return self.OnRegistrationChanged((e == 0) ? null : new RegistrationEvent(e, false));
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
